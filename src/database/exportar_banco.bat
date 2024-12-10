@echo off
echo Exportando banco de dados...
mysqldump -u root -p cadastro > database.sql
pause
