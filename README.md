Configurar o MySQL e Importar o Banco
1. Instale o MySQL Community Server: [Instruções aqui](https://dev.mysql.com/downloads/).
2. Baixe o arquivo database.sql na pasta database/ do repositório.
3. Abra o terminal na pasta do arquivo e execute:
  mysql -u root -p < database.sql
4. Acesse o banco no terminal para verificar:
  mysql -u root -p
  SHOW DATABASES;
  USE nome_do_banco;
  SHOW TABLES;
