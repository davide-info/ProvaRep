package model;

public class Product {
private int idProduct ;
private String name ;
private float  price ;
public void setIdProduct(int idProduct) {
	this.idProduct = idProduct;
}
public int getIdProduct() {return idProduct;}
public void setPrice(float price) {
	this.price = price ;
}
public float getPrice() {return price;}
public void setName(String name) {
	this.name = name;
}
public String getName() {return name;}
@Override
public String toString() {
	return String.format("Product [idProduct=%s, name=%s, price=%s]", idProduct, name, price);
}

}
