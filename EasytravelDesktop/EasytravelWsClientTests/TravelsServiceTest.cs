using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Armandorv.EasytravelWsClient;

namespace EasytravelWsClientTests
{
    /// <summary>
    /// Descripción resumida de TravelsServiceTest
    /// </summary>
    [TestClass]
    public class TravelsServiceTest
    {
        private ITravelsService travelsService;

        public TravelsServiceTest()
        {
            travelsService = new TravelsService();
        }

        private TestContext testContextInstance;

        /// <summary>
        ///Obtiene o establece el contexto de las pruebas que proporciona
        ///información y funcionalidad para la ejecución de pruebas actual.
        ///</summary>
        public TestContext TestContext
        {
            get
            {
                return testContextInstance;
            }
            set
            {
                testContextInstance = value;
            }
        }

        #region Atributos de prueba adicionales
        //
        // Puede usar los siguientes atributos adicionales conforme escribe las pruebas:
        //
        // Use ClassInitialize para ejecutar el código antes de ejecutar la primera prueba en la clase
        // [ClassInitialize()]
        // public static void MyClassInitialize(TestContext testContext) { }
        //
        // Use ClassCleanup para ejecutar el código una vez ejecutadas todas las pruebas en una clase
        // [ClassCleanup()]
        // public static void MyClassCleanup() { }
        //
        // Usar TestInitialize para ejecutar el código antes de ejecutar cada prueba 
        // [TestInitialize()]
        // public void MyTestInitialize() { }
        //
        // Use TestCleanup para ejecutar el código una vez ejecutadas todas las pruebas
        // [TestCleanup()]
        // public void MyTestCleanup() { }
        //
        #endregion

        [TestMethod]
        public void TestGetTravels()
        {
           IList<Travel> travels = travelsService.GetTravels("a");
           Console.WriteLine(travels);
        }

        [TestMethod]
        public void TestMostVisitedDestination()
        {
           Destination dest = travelsService.MostVisitedDestination();
           Console.WriteLine(dest);
        }

        [TestMethod]
        public void TestMostVisitedDestinations()
        {
           IList<Destination> dests = travelsService.MostVisitedDestinations(10);
           Console.WriteLine(dests);
        }

        [TestMethod]
        public void TestNumberOfTravelsByDestination()
        {
            int num = travelsService.NumberOfTravelsByDestination("");
            Console.WriteLine(num);
        }

        [TestMethod]
        public void TestIsVisited()
        {
            bool visited = travelsService.HasVisited("", "");
            Console.WriteLine(visited);
        }
    }
}
