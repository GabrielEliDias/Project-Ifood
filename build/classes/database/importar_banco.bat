@echo off
echo Importando banco de dados...
mysql -u root -p < database.sql
pause