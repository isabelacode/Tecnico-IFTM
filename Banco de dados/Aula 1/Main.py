import mysql.connector

mydb = mysql.connector.connect(
    host="relational.fit.cvut.cz",
    user="guest",
    password="relational",
    database="northwind"
)

print("Digite um nome a ser pesquisado:")
nome = input()

mycursor = mydb.cursor()

mycursor.execute("SELECT * FROM Customers where ContactName like '%" + nome + "%'")
mycursor.execute(f'SELECT * FROM Customers where ContactName like %{nome}%')

myresult = mycursor.fetchall()

for registro in myresult:
    print(registro)