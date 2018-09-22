package com.company;

public class Customer {

    private Long id;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Customer otherCustomer = (Customer) obj;
        if(this.id != otherCustomer.id && (this.id == null || !this.id.equals(otherCustomer.id))){
            return false;
        }
        return true;
    }
}
