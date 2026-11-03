package com.klu.MyMavenProject;

public class Supplier extends Person {

    public class Test {

	}

	public class Sale {

	}

	public class Prescription {

	}

	private String companyName;

    public Supplier(int id, String name, String phone,
                    String companyName) {

        super(id, name, phone);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getRole() {
        return "Supplier";
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Company: " + companyName +
               ", Role: " + getRole();
    }
}