#!/bin/bash

VERSION="${VERSION:-}"

for file in $(ls /docker-entrypoint-initdb.d/migrations/*.sql | sort); do

    file_name="${file##*/}"
    migration_version="${file_name%%__*}"

    if [[ -z "$VERSION" || "$migration_version" < "$VERSION" || "$migration_version" == "$VERSION" ]]; then
        echo "Executing migration: $file"
        psql -U "$POSTGRES_USER" -d "$POSTGRES_DB" -f "$file"
    else
        echo "Skipping migration: $file"
    fi
done