import random
"""
nomes = [
    'Miau', 'Au-Au', 'Mel', 'Hope', 'Jade', 'Nemo', 'Pistão', 'Norman', 'Blue', 'Haru', 'Rex'
]
especies = [
    'gato', 'cachorro', 'peixe', 'tartaruga', 'papagaio'
]

for i in range(10):
    nomex = random.choice(nomes)
    especiex = random.choice(especies)
    print('insert into animal (codigo_do_pet, nome, especie)')
    print(f'values({i},\'{nomex}\', \'{especiex}\');')
    # nomes.remove(nomex)


#nome tem que ser completo, nome e sobrenome
#email tem quer ser no padrao nome@servidor.com.br
#endereço completo rua, av, numeração e cidade

nomes =['Helena', 'Alice', 'Laura','Manuela','Sophia','Isabella','Miguel','Arthur','Théo','Heitor','Gael']

sobrenomes = ['Silva', 'Pereira', 'Oliveira', 'Batista']

servidores = ['gmail.com', 'yahoo.com.br', 'amazon.com.br', 'protomail.com', 'uol.com.br']

ruas = ['Rua 1', 'Rua 2', 'Rua 3 ', 'Rua 4', 'Rua 5']

numeros = [366,123,145]

bairros = ['Marta Helena', 'Pirapitinga', 'Guimaraes']

cidades = ['Ituiutaba', 'Uberlândia', 'São Paulo', 'Belo Horizonte', 'Goiânia']

for i in range(10):
    nomex = random.choice(nomes)
    sobrenomex = random.choice(sobrenomes)
    cidadex = random.choice(cidades)
    servidorex = random.choice(servidores)
    ruax = random.choice(ruas)
    numerox = random.choice(numeros)
    bairrox = random.choice(bairros)
    print('insert into cliente (cpf_cliente, nome, email, endereco, cidade, data_de_nasc, idade, telefone)')
    print(f'values({i+141}{i+420}{i+216}{i+48},\'{nomex} {sobrenomex}\', \'{nomex.lower()}@{servidorex.lower()}\', \'{ruax} numero: {numerox} bairro: {bairrox}\', \'{cidadex}\', "1999-0{i}-{i+20}", {i+18}, {i+20}10{2000+i});')

letras = ['abcd', 'sahg', 'posa', 'sads', 'dasd']
numeros =[1245,1234,1548,4523,5236]
marcas = ['Fiat', 'Chevrolet', 'Mercedes-Benz', 'Toyota']
modelos = ['Carro Conversível', 'Carro Sedã', 'Carro hatch ou hatchback', 'Coupé ou cupê (Fastback)', 'Perua ou SW (Station Wagons)']
cores = ['amarelo', 'azul', 'rosa', 'preto', 'branco', 'verde']
combustiveis = ['gasolina', 'alcool', 'flex']
descricoes = ['novo', 'velho']

for i in range(10):
    letrax = random.choice(letras)
    numerox = random.choice(numeros)
    marcax = random.choice(marcas)
    modelox = random.choice(modelos)
    corx = random.choice(cores)
    combustivelx = random.choice(combustiveis)
    descricaox = random.choice(descricoes)
    print('insert into veiculos(placa, marca, modelo, descricao, cor, combustivel)')
    print(f'values(\'{letrax} {numerox}\', \'{marcax}\', \'{modelox}\',\'{descricaox}\', \'{corx}\', \'{combustivelx}\');')

"""
placas = ['dasd 4523', 'abcd 1234', 'dasd 4523', 'posa 1548', 'sads 5236', 'sads 1245', 'posa 5236', 'dasd 4523', 'sads 4523', 'abcd 5236']

"""
for i in range(10):
    placax =random.choice(placas)
    print('insert into manutencao(cod_manut, placa, preco, data_da_manut)')
    print(f'values({i}, \'{placax}\', 600.56, \'2022-0{i}-{i+20} {i+10}-40-00\');')


cpfs = [14142021648,14242121749,14342221850,14442321951,14542422052, 14642522153, 14742622254, 14842722355, 14942822456, 15042922557]
for i in range(10):
    placax =random.choice(placas)
    cpfx = random.choice(cpfs)
    print('insert into contrato(cod_contrato, placa, cpf_cliente, dia_e_horario, preco_diaria, preco_seguro)')

nomes =['Helena', 'Alice', 'Laura','Manuela','Sophia','Isabella','Miguel','Arthur','Théo','Heitor','Gael']

sobrenomes = ['Silva', 'Pereira', 'Oliveira', 'Batista']

cargos = ['Auxiliar', 'Assistente', 'Supervisor', 'Analista', 'Gerente', 'Diretor', 'Atendente']

for i in range(10):
    nomex = random.choice(nomes)
    sobrenomex = random.choice(sobrenomes)
    dependentex = random.choice(nomes)
    cargox = random.choice(cargos)
    print('insert into empregados(matricula, nome, sexo, telefone, dependentes, data_de_emisao, cargo, id_projeto)')
    print(f'values({i}, \'{nomex} {sobrenomex}\',\'\', {i+20}10{2000+i}, \'{dependentex} {sobrenomex}\', \'2022-03-30\',  \'{cargox}\', {i+1});')


gerente = ['SO', 'IB', 'MP', 'AP']

nomes = ['Big husky', 'Apollo', 'Astron', 'Fénix', 'FreshMove', 'Feixe de vapor', 'alvorecer', 'Sério', 'Aleatório']

for i in range(10):
    gerentex = random.choice(gerente)
    nomex = random.choice(nomes)
    print('insert into departamentos(cod_departamento, nome, sigla_do_chefe)')
    print(f'values({i}, \'{nomex}\', \'{gerentex}\');')
"""
titulos = ['Administrativo', 'Financeiro', 'Recursos Humanos', 'Setor comercial', 'Setor operacional']
horas = [20, 40, 152, 452]
for i in range(10):
    titulox =  random.choice(titulos)
    horax =  random.choice(horas)
    print('insert into projetos(id_departamento, matricula, id_projeto, titulo, horas_previstas)')
    print(f'values({i+2}, {i+1}, {i}, \'{titulox}\', {horax});')