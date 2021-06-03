package ro.ase.cts.UnitTesting.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteGrupa.class, TesteGrupaFixture.class, TesteGrupaMock.class })
public class AllTests {

}
