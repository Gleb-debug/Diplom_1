import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.*;

public class IngredientTypeTest {
    @Test//Проверяем, что все типы ингредиентов существуют
    public void testIngredientTypeExistsSauce(){
        //Проверяем наличие всех типов
        assertNotNull(IngredientType.SAUCE);
    }

    @Test//Проверяем, что название типов совпадают с ожидаемыми значениями
    public void testIngredientTypeNamesFilling(){
        assertEquals("FILLING", IngredientType.FILLING.name());
    }

    @Test//Проверяем, что название типов совпадают с ожидаемыми значениями
    public void testIngredientTypeNamesSauce(){
        assertEquals("SAUCE", IngredientType.SAUCE.name());
    }

    @Test//Проверяем, что все типы ингредиентов существуют
    public void testIngredientTypeExistsFilling(){
        //Проверяем наличие всех типов
        assertNotNull(IngredientType.FILLING);
    }
}

