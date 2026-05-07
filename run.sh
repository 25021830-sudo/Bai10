#!/bin/bash
# run_bai_standard.sh
echo "--- Đang thực thi bài tập ---"
mvn clean package
echo "--- Kiểm tra file thực thi JAR ---"
java -jar target/*.jar