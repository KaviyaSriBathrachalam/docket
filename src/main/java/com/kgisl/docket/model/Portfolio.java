package com.kgisl.docket.model;

import javax.persistence.*;

import java.util.List;

@Entity
public class Portfolio{
	public Portfolio() {}
	public Portfolio(Long id,String cat,String symbol){
		id=this.id;
		cat=this.cat;
		symbol=this.symbol;
	   }

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column
	String cat;

  @Column
	 String symbol;

	 @OneToMany( mappedBy = "id" )
     private List<Portfolio> portfolio; 
     




public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getSymbol() {
	return symbol;
}
	 
public void setSymbol(String symbol) {
	this.symbol = symbol;
}	
	 
public String getCat() {
return cat;
}

public void setCat(String cat) {
  this.cat = cat;
}

// public List<Portfolio> getPortfolio() {
// 	return portfolio;
//  }
// public void setPortfolio(List<Portfolio> portfolio) {
// 	this.portfolio = portfolio;
// }




	@Override
	public String toString() {
	    return "["+id+" "+cat+" "+symbol+"]";
	}

	}