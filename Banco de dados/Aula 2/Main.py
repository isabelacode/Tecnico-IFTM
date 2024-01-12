import mysql.connector

mydb = mysql.connector.connect(
    host = "relational.fit.cvut.cz",
    user = "guest",
    password = "relational",
    database = "northwind"

)

print("Escolha uma tabela a ser consultada:")
print("1 - Customers (Clientes)")
print("2 - Employees (Empregados)")
print("3 - Orders (Compras)")
print("4 - Suppliers(Fornecedores)")
print("5 - Products(Produtos)")
print("6 - Shippers(Transportadoras)")
opcao = input()
if (opcao == '1'):
    tabela = "Customers"
    coluna = "ContactName"
    print("Digite um nome a ser pesquisado:")
    nome = input()
if (opcao == '2'):
    tabela = "Employees"
    coluna = "FirstName"
    print("Digite um nome a ser pesquisado:")
    nome = input()
if (opcao == '3'):
    tabela = "Orders"
    coluna = "OrderID" 
    print("Digite o id da compra")
    nome = input()
if (opcao == '4'):
    tabela = "Suppliers"
    coluna = "ContactName"
    print("Digite um nome a ser pesquisado:")
    nome = input()
if(opcao == '5'):
    tabela = "Products"
    coluna = "ProductName"
    print("Digite um nome do produto a ser pesquisado:")
    nome = input()
if(opcao == '6'):
    tabela = "Shippers"
    coluna = "CompanyName"
    print("Digite um nome da transportadora a ser pesquisada:")
    nome = input()

mycursor = mydb.cursor()

mycursor.execute(f'SELECT * FROM {tabela} where {coluna} like "%{nome}%"')

myresult = mycursor.fetchall()

for registro in myresult:
    print(registro)