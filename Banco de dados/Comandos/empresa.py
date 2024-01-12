
from random import random


nomes =['Helena', 'Alice', 'Laura','Manuela','Sophia','Isabella','Miguel','Arthur','Théo','Heitor','Gael']

sobrenomes = ['Silva', 'Pereira', 'Oliveira', 'Batista']

cargos = ['Auxiliar', 'Assistente', 'Supervisor', 'Analista', 'gerente', 'diretor']

for i in range(10):
    nomex = random.choice(nomes)
    sobrenomex = random.choice(sobrenomes)
    dependentex = random.choice(nomes)
    cargox = random.choice(cargos)
    print('insert into empregados(matricula, nome, sexo, telefone, dependentes, data_de_emisao, cargo)')
    print(f'values({i}, \'{nomex} {sobrenomex}\', , {i+20}10{2000+i}, \' {dependentex} {sobrenomex}\', \'2022-0{i}-{i+20} {i+10}-40-00\',  \'{cargox}\');')