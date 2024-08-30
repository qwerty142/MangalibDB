#!/bin/bash

root="backup"
script_path="$root/create_backup.sh"
while true; do
    echo "Executing $script_path"
    bash "$script_path"

    sleep 60
done