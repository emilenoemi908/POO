public class compras {
    public static void main(String[] args) {

        ShoppingCart carrinho= new ShoppingCart(1);

        Product book1 = new Product("Livro A", 29.90);
        Product book2 = new Product("Livro B", 39.50);
        Product book3 = new Product("Livro C", 45.00);

        carrinho.addProduct(book1);
        carrinho.addProduct(book2);
        carrinho.addProduct(book3);

        carrinho.getContents();

        System.out.println("\nCliente ID: " + carrinho.getCustomerID());
        System.out.println("\nTotal de itens no carrinho: " + carrinho.getItemCount());
        System.out.println("Preço total: R$ " + carrinho.getTotalPrice());

        // Removendo
        carrinho.removeProduct(book2);
        System.out.println("\nApós remover um produto:");


        carrinho.getContents();
        System.out.println("\nTotal de itens no carrinho: " + carrinho.getItemCount());
        System.out.println("Preço total: R$ " + carrinho.getTotalPrice());
    }
}

