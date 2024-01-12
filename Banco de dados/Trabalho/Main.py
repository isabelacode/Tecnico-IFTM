import mysql.connector

mydb = mysql.connector.connect(
    host="relational.fit.cvut.cz",
    user="guest",
    password="relational",
    database="northwind"
)

mycursor = mydb.cursor()


mycursor.execute(f'SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE = "BASE TABLE" AND TABLE_SCHEMA="northwind" ')

myresult = mycursor.fetchall()

for myresult, tabelas in enumerate(myresult):
    print(myresult, f'{tabelas[0]}')

print("Escolha uma tabela a ser consultada:")
opcao = input()   

if (opcao == '0'):
    mycursor = mydb.cursor()
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "Categories" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "Categories"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "CategoryID"
    elif(teclado == '1'):
        coluna = "CategoryName"
    elif(teclado == '2'):
        coluna = "Description"
    elif(teclado == '3'):
        coluna = "Picture"

if (opcao == '1'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "CustomerCustomerDemo" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "CustomerCustomerDemo"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "CustomerID"
    if(teclado == '1'):
        coluna = "CustomerTypeID"

if (opcao == '2'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "CustomerDemographics" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "CustomerDemographics"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "CustomerTypeID"
    if(teclado == '1'):
        coluna = "CustomerDesc"

if (opcao == '3'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "Customers" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "Customers"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "CustomerID"
    elif(teclado == '1'):
        coluna = "CompanyName"
    elif(teclado == '2'):
        coluna = "ContactName"
    elif(teclado == '3'):
        coluna = "ContactTitle"
    elif(teclado == '4'):
        coluna = "Address"
    elif(teclado == '5'):
        coluna = "City"
    elif(teclado == '6'):
        coluna = "Region"
    elif(teclado == '7'):
        coluna = "PostalCode"
    elif(teclado == '8'):
        coluna = "Country"
    elif(teclado == '9'):
        coluna = "Phone"
    elif(teclado == '10'):
        coluna = "Fax"
if (opcao == '4'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "EmployeeTerritories" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "EmployeeTerritories"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "EmployeeID"
    elif(teclado == '1'):
        coluna = "TerritoryID"

if (opcao == '5'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "Employees" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "Employees"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "EmployeeID"
    elif(teclado == '1'):
        coluna = "LastName"
    elif(teclado == '2'):
        coluna = "FirstName"
    elif(teclado == '3'):
        coluna = "Title"
    elif(teclado == '4'):
        coluna = "TitleOfCourtesy"
    elif(teclado == '5'):
        coluna = "BirthDate"
    elif(teclado == '6'):
        coluna = "HireDate"
    elif(teclado == '7'):
        coluna = "Address"
    elif(teclado == '8'):
        coluna = "City"
    elif(teclado == '9'):
        coluna = "Region"
    elif(teclado == '10'):
        coluna = "PostalCode"
    elif(teclado == '11'):
        coluna = "Country"
    elif(teclado == '12'):
        coluna = "HomePhone"
    elif(teclado == '13'):
        coluna = "Extension"
    elif(teclado == '14'):
        coluna = "Photo"
    elif(teclado == '15'):
        coluna = "Notes"
    elif(teclado == '16'):
        coluna = "ReportsTo"
    elif(teclado == '17'):
        coluna = "PhotoPath"
    elif(teclado == '18'):
        coluna = "Salary"

if (opcao == '6'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "[Order Details]" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "Employees"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "OrderID"
    elif(teclado == '1'):
        coluna = "ProductID"
    elif(teclado == '2'):
        coluna = "UnitPrice"
    elif(teclado == '3'):
        coluna = "Quantity"
    elif(teclado == '4'):
        coluna = "Discount"

if (opcao == '7'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "Orders" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "Orders"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "OrderID"
    elif(teclado == '1'):
        coluna = "CustomerID"
    elif(teclado == '2'):
        coluna = "EmployeeID"
    elif(teclado == '3'):
        coluna = "OrderDate"
    elif(teclado == '4'):
        coluna = "RequiredDate"
    elif(teclado == '5'):
        coluna = "ShippedDate"
    elif(teclado == '6'):
        coluna = "ShipVia"
    elif(teclado == '7'):
        coluna = "Freight"
    elif(teclado == '8'):
        coluna = "ShipName"
    elif(teclado == '9'):
        coluna = "ShipAddress"
    elif(teclado == '10'):
        coluna = "ShipCity"
    elif(teclado == '11'):
        coluna = "ShipRegion"
    elif(teclado == '12'):
        coluna = "ShipPostalCode"
    elif(teclado == '13'):
        coluna = "ShipCountry"
    
if (opcao == '8'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "Products" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "Products"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "ProductID"
    elif(teclado == '1'):
        coluna = "ProductName"
    elif(teclado == '2'):
        coluna = "SupplierID"
    elif(teclado == '3'):
        coluna = "QuantityPerUnit"
    elif(teclado == '4'):
        coluna = "UnitPrice"
    elif(teclado == '5'):
        coluna = "UnitsInStock"
    elif(teclado == '6'):
        coluna = "UnitsOnOrder"
    elif(teclado == '7'):
        coluna = "ReorderLevel"
    elif(teclado == '8'):
        coluna = "ShipName"
    elif(teclado == '9'):
        coluna = "Discontinued"

if (opcao == '9'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "Region" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "Region"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "RegionID"
    elif(teclado == '1'):
        coluna = "RegionDescription"

if (opcao == '10'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "Shippers" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "Shippers"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "ShipperID"
    elif(teclado == '1'):
        coluna = "CompanyName"
    elif(teclado == '2'):
        coluna = "Phone"

if (opcao == '11'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "Suppliers" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "Suppliers"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "SupplierID"
    elif(teclado == '1'):
        coluna = "CompanyName"
    elif(teclado == '2'):
        coluna = "ContactName"
    elif(teclado == '3'):
        coluna = "ContactTitle"
    elif(teclado == '4'):
        coluna = "Address"
    elif(teclado == '5'):
        coluna = "City"
    elif(teclado == '6'):
        coluna = "Region"
    elif(teclado == '7'):
        coluna = "PostalCode"
    elif(teclado == '8'):
        coluna = "Country"
    elif(teclado == '9'):
        coluna = "Phone"
    elif(teclado == '10'):
        coluna = "Fax"
    elif(teclado == '11'):
        coluna = "HomePage"

if (opcao == '12'):
    mycursor.execute(f'SELECT column_name FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = "Territories" and table_schema = "northwind"')
    myresult = mycursor.fetchall()
    for myresult, colunas in enumerate(myresult):
        print(myresult, f'{colunas[0]}')
    tabela = "Territories"
    print("Qual coluna? ")
    teclado = input()
    if(teclado == '0'):
        coluna = "TerritoryID"
    elif(teclado == '1'):
        coluna = "TerritoryDescription"
    elif(teclado == '2'):
        coluna = "RegionID"
print("O que deseja pesquisar?")
teclado = input()

mycursor = mydb.cursor()


mycursor.execute(f'SELECT * FROM {tabela} where {coluna} like "%{teclado}%"')

myresult = mycursor.fetchall()

for registro in myresult:
    print(registro)

