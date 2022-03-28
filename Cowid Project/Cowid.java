package com.cowid.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Cowid")
public class Cowid {
    @Id
    
    private int cid;
    
    private String clocation;
    private int ccases;

    private int cnewcases;
    


    

    /**
     * @return int return the cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(int cid) {
        this.cid = cid;
    }

    /**
     * @return String return the clocation
     */
    public String getClocation() {
        return clocation;
    }

    /**
     * @param clocation the clocation to set
     */
    public void setClocation(String clocation) {
        this.clocation = clocation;
    }

    /**
     * @return int return the ccases
     */
    public int getCcases() {
        return ccases;
    }

    /**
     * @param ccases the ccases to set
     */
    public void setCcases(int ccases) {
        this.ccases = ccases;
    }

    /**
     * @return int return the cnewcases
     */
    public int getCnewcases() {
        return cnewcases;
    }

    /**
     * @param cnewcases the cnewcases to set
     */
    public void setCnewcases(int cnewcases) {
        this.cnewcases = cnewcases;
    }

  
    public Cowid() {
	}
	public Cowid(int cid , String clocation , int ccases , int cnewcases ) {
		super();
		this.cid = cid;
		this.clocation = clocation;
		this.ccases = ccases;
		this.cnewcases = cnewcases;
	}
	@Override
	public String toString() {
		return "Covid [new_cases=" + cnewcases + ", location=" + clocation + ",ccases=" + ccases + "]";
	}

}
