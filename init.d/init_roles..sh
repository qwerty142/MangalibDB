#!/bin/bash

SCHEMA="${SCHEMA:-public}"


READER_PASSWORD="${READER_PASSWORD:-reader}"
/docker-entrypoint-initdb.d/role/init_reader.sh --schema=$SCHEMA --password=$READER_PASSWORD


WRITER_PASSWORD="${WRITER_PASSWORD:-reader}"
/docker-entrypoint-initdb.d/role/init_writer.sh --schema=$SCHEMA --password=$WRITER_PASSWORD


ANALYST_PASSWORD="${ANALYST_PASSWORD:-analyst}"
ANALYST_TABLE="${ANALYST_TABLE:-reviews}"
/docker-entrypoint-initdb.d/role/init_anal.sh --schema=$SCHEMA --table=$ANALYST_TABLE --password=$ANALYST_PASSWORD