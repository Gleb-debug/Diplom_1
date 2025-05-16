import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.*;

public class BunTest {

    @Test//Проверяем, что название булочки присваевается верно
    public void testGetNameReturnCorrectValue(){
        //Создаем объект bun с тестовым именем булочки
        Bun bun = new Bun("Краторная булка N-200i", 1255);

        //Проверяем, что булочке присвоено верное имя
        assertEquals("Краторная булка N-200i", bun.getName());
    }

    @Test//Проверяем, что цена булочки присвоена верно
    public void testGetPriceReturnCorrectValue(){
        //Создаем объект bun с тестовой ценой булочки
        Bun bun = new Bun("Краторная булка N-200i", 1255);

        //Проверяем, что булочке присвоена верная цена
        assertEquals(1255, bun.getPrice(), 0.0f);
    }
}
