package ro.ase.cts.UnitTesting.teste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.UnitTesting.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.UnitTesting.teste.categorii.TesteUrgenteCategory;

@RunWith(Categories.class)
@SuiteClasses({ AllTests.class, TesteGrupa.class, TesteGrupaFixture.class, TesteGrupaMock.class })
@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgenteCategory.class)
public class SuitaCustom {

}
