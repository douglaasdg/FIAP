print("Bem vindo ao Café Python!")
print("Escolha o tamanho do seu café: (P) Pequeno (R$2,50), (M) Médio (R$3,00), (G) Grande (R$3,50).")
tamanho_cafe = input("Esolha o tamanho: ").upper()

print("Escolha o tipo do café: (E) Expresso (R$1,50), (C) Cappuccino R$(2,00), (L) Latte (R$2,50).")
tipo_cafe = input("Escolha o tipo de café: ").upper()

preco = 0

match tamanho_cafe:
    case "P":
        preco += 2.50
    case "M":
        preco += 3.00
    case "G":
        preco += 3.50
    case _:
        print("Opção de tamanho inválida!")
        exit()

match tipo_cafe:
    case "E":
        preco += 1.50
    case "C":
        preco += 2.00
    case "L":
        preco += 2.50
    case _:
        print("Opção do tipo de café inválida!")
        exit()

print("Seu pedido foi confirmado!")
print(f"Total a pagar: R$ {preco}")