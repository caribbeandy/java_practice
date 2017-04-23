#!/bin/bash 

usage() { 
    echo "Bad error message" >&2 
} 

# if num args not equal to 1
if [ $# -ne 1 ]; then 
    usage 
    exit 1 
fi 

# if file does not exist
if [ -e "$1" ]; then 
    usage 
    exit 1 
fi 

for x in *.in; do 
    echo ${x%.in} >> "$1" 
done

