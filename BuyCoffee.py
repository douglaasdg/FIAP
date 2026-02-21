print("Bem-vindo ao Café Python!")

# Variáveis para armazenar o valor total e a quantidade de cafés pedidos
valor_total = 0
quantidade_cafes = 0
continuar_pedido = True

while continuar_pedido:
    print("Escolha o tamanho do seu café: (P) Pequeno, (M) Médio, (G) Grande")
    tamanho_cafe = input("Escolha o tamanho (ou digite 'F' para finalizar o pedido): ").upper()

    if tamanho_cafe == 'F':
        continuar_pedido = False
    else:
        tipo_cafe = input("Escolha o tipo de café: (E) Espresso, (C) Cappuccino, (L) Latte").upper()

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
                continue  # Volta ao início do loop

        match tipo_cafe:
            case "E":
                preco += 1.50
                print("Café Espresso selecionado")
            case "C":
                preco += 2.00
                print("Café Cappuccino selecionado")
            case "L":
                preco += 2.50
                print("Café Latte selecionado")
            case _:
                print("Opção de café inválida!")
                continue  # Volta ao início do loop

        valor_total += preco
        quantidade_cafes += 1

        print("Café adicionado ao pedido!")

print(f"Seu pedido foi finalizado. Total a pagar: R${valor_total}")
print(f"Quantidade de cafés pedidos: {quantidade_cafes}")