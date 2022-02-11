package fuelInjection;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import fuelInjection.domain.Avante;
import fuelInjection.domain.K5;
import fuelInjection.domain.Sonata;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    void Car��_List��_�������Ѵ�() {
        RentCompany company = RentCompany.create();

        assertThat(company.getRentCars().size())
            .isEqualTo(0);
    }

//    @Test
//    public void report() throws Exception {
//        RentCompany company = RentCompany.create(); // factory method�� ����� ����
//        company.addCar(new Sonata(150));
//        company.addCar(new K5(260));
//        company.addCar(new Sonata(120));
//        company.addCar(new Avante(300));
//        company.addCar(new K5(390));
//
//        String report = company.generateReport();
//        assertThat(report).isEqualTo(
//            "Sonata : 15����" + NEWLINE +
//                "K5 : 20����" + NEWLINE +
//                "Sonata : 12����" + NEWLINE +
//                "Avante : 20����" + NEWLINE +
//                "K5 : 30����" + NEWLINE
//        );
//    }
}
