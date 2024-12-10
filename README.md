Configurar o MySQL e Importar o Banco
1. Instale o MySQL Community Server: [Instruções aqui](https://dev.mysql.com/downloads/).
2. Baixe o arquivo database.sql na pasta database/ do repositório.
3. Localize a pasta bin do MySQL (ex.: C:\Program Files\MySQL\MySQL Server X.X\bin) e adicione ela à variável de ambiente "Path".
4. Para importar o banco de dados, abra o terminal na pasta do projeto e digite: mysql -u root -p < src\database\database.sql
5. Para exportar o banco de dados, abra o terminal na pasta do projeto e digite: mysqldump -u root -p cadastro > src\database\database.sql
