import mysql.connector

mydb = mysql.connector.connect(
    host="relational.fit.cvut.cz",
    user="guest",
    password="relational",
    database="northwind"
)

mycursor = mydb.cursor()

mycursor.execute(f'SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE = "BASE TABLE" AND TABLE_SCHEMA="northwind"')

myresult = mycursor.fetchall()

for registro in myresult:
    print(f'{registro[0]}')