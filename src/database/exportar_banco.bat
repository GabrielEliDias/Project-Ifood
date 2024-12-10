@echo off
echo Exportando banco de dados...
mysqldump -u root -p nome_do_banco > database.sql
pause
