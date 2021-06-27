#language: pt
Funcionalidade: Cadastrar Usuarios

Cenario: Tentar realizar cadastro sem o preenchimento do campo email
Dado que acesso o site de cadastro da stefanini
Quando Realizo o preenchimento do Nome "Manoel Soares"
E realizo o preenchimento do campo Senha "69190130"
E Clico no botao "Cadastrar"
Entao exibe a mensagem a baixo do campo email "O campo E-mail é obrigatório."


Cenario: Tentar realizar cadastro preenchendo apenas o primeiro nome
Dado que acesso o site de cadastro da stefanini
Quando realizo o preenchimento do Nome "Manoel"
E realizo o preenchimento do campo Senha "69190130"
E clico no botao "Cadastrar"
Entao exibe a mensagem abaixo do campo Nome "Por favor, insira um nome completo."

Cenario: Tentar realizar cadastro com e-mail invalido
Dado que acesso o site de cadastro da stefanini
Quando realizo o preenchimento do Nome "Lucas Soares"
E realizo o preenchimento do campo email "lucas"
E realizo o preechimento do campo Senha "69190130"
E clico no botao "Cadastrar"
Entao exibe a mensagem abaixo do campo email "Por favor, insira um e-mail válido."


Cenario: Tentar realizar cadastro de usuario com o campo senha com menos de oito caracteres
Dado que acesso o site de cadastro da stefanini
Quando realizo o preenchimento do Nome "Lucas Soares"
E realizo o preenchimento do campo email: "lucas.soares@gmail.com"
E realizo o preechimento do campo senha com menos que oito caracteres "69"
E clico no botao "Cadastrar"
Entao exibe a mensagem abaixo do campo Senha "A senha deve conter ao menos 8 caracteres."



Cenario: Efetuar cadastro do usuario
Dado que acesso o site de cadastro da stefanini
Quando realizo o preenchimento do Nome "Lucas Soares"
E realizo o preenchimento do campo email: "lucas.soares@gmail.com"
E realizo o preechimento do campo Senha "69190131"
E clico no botao "Cadastrar"
Entao exibe na tabela de Usuarios Cadastrados Id "1"
E Nome "Lucas Soares"
E email "lucas.soares@gmail.com"





Cenario: Efetuar exclusao de usuario cadastrado
Dado que acesso o site de cadastro da stefanini
Quando realizo o preenchimento do Nome "Lucas Soares Moura"
E realizo o preenchimento do campo email: "lucas.soares@gmail.com2"
E realizo o preechimento do campo Senha "69190135"
E clico no botao "Cadastrar"
E clico no link referente ao primeiro ID "Excluir"
Entao retorna para a tela de "Formulario"






