Configurar o MySQL e Importar o Banco
1. Instale o MySQL Community Server: [Instruções aqui](https://dev.mysql.com/downloads/).
2. Baixe o arquivo database.sql na pasta database/ do repositório.
3. Localize a pasta bin do MySQL (ex.: C:\Program Files\MySQL\MySQL Server X.X\bin) e adicione ela à variável de ambiente "Path".
4. Para importar o banco de dados, abra o terminal na pasta do projeto e digite: mysql -u root -p < src\database\database.sql
5. Para exportar o banco de dados, abra o terminal na pasta do projeto e digite: mysqldump -u root -p cadastro > src\database\database.sql

![image](https://github.com/user-attachments/assets/43b11900-ed66-46e1-a284-18e4f242a4ee)
![image](https://github.com/user-attachments/assets/bec37263-661f-4dca-98fd-58a82d084219)
![image](https://github.com/user-attachments/assets/40f5e444-1f59-434a-a6d8-67915b8b08e9)
![image](https://github.com/user-attachments/assets/c49c8d71-2779-4808-ab63-1cf1d60f13f2)
![image](https://github.com/user-attachments/assets/d6dab8ad-b719-42a4-9b0a-641e9c7fb125)
