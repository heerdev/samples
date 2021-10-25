package com.jpa.resource;


import com.jpa.service.PartyStatusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
    @Autowired
    private PartyStatusDao partyStatusDa;
    @GetMapping("hello")
    public String sayPlainTextHello() {

        System.out.println("XXXXXXXXXXXXX " +partyStatusDa.getDescription());
        return partyStatusDa.getDescription();
    }

/*    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PartyStatusDao partyStatusDa = new PartyStatusDao();
            System.out.println("XXXXXXXXXXXXX " +partyStatusDa.getDescription());
            response.getOutputStream().println(partyStatusDa.getDescription());
        }*/

}