package com.kgisl.docket.Servie;

import java.util.List;

import com.kgisl.docket.model.Portfolio;



public interface PortfolioService {

    public List<Portfolio> getAll();

    // public Portfolio save(Portfolio portfolio);

    // public Portfolio find(long id);

    public void delete(Long pId);


    public List<Portfolio>save(List<Portfolio>  p);

    public void update(Portfolio portfolio,Long pId);

}