#Author: Keila da Silva - keila.silva38@gmail.com
Feature: Cadastro
Realizar o cadastro de seguros de veículos

Scenario: Cadastrar o Seguro de um veículo com sucesso
		Given que informo os campos da aba enter Vehicle Data e prossigo
		And informo os dados da aba enter Insurant Data e prossigo
		And informo os dados da aba enter Product Data e prossigo
		And informo os dados da aba Select Price Option e prossigo
		And informo os dados da aba Send Quote e envio
		Then valido a mensagem de sucesso