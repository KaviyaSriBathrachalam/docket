package com.kgisl.docket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kgisl.docket.Controller.PortfolioController;
import com.kgisl.docket.Repository.PortfolioRepository;
import com.kgisl.docket.Servie.PortfolioService;
import com.kgisl.docket.model.Portfolio;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class PortfolioControllerUITest {
        @InjectMocks
        private PortfolioController portfolioController;
 
        // @Mock
        // private PortfolioService portfolioService;
@Mock
private PortfolioRepository portfolioRepository;

        public static List<Portfolio>  expectedPortfolio;

        @Test
        public void findPortfolioTest() {
                System.out.println("UNIT TEST 1");
                Portfolio portfolio1 = new Portfolio(1L,"nifty","TCS");
  
        }   
}


























// Portfolio portfolio1 = new Portfolio(1L, "cnxFMCG", "SRTRANSFIN");
// portfolio1.setId(1L);
// portfolio1.setCat("cat");
// portfolio1.setSymbol("symbol");
// System.out.println("ppppppp" + portfolio1);
// expectedPortfolio.add(portfolio1);
// List<Portfolio> expectedPortfolio=Arrays.asList(portfolio1);
// System.out.println( portfolioRepository.findAll());

// when( portfolioRepository.findAll()).thenReturn(expectedPortfolio);
// // System.out.println( portfolioRepository.findAll());

// List<Portfolio> actualPortfolio = portfolioRepository.findAll();
// assertNotNull(actualPortfolio);