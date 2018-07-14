package generics;

public class ChildProuct<T,M,C> extends Product<T,M> {
    private C company;
    public C getCompany() {return this.company;}
    public void setCompany(C company) {this.company = company;}
}
