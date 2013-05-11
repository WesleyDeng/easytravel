using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Armandorv.EasytravelWsClient;

namespace Armandorv.EasytravelClient.Model
{
    class FackeTravelsService:ITravelsService
    {
        public IList<Travel> GetTravels(string term)
        {
            IList<Travel> travels = new List<Travel>();
            travels.Add(new Travel("Fcked form " + term));
            return travels;
        }


        public bool HasVisited(string username, string destination)
        {
            if ("false".Equals(username))
                return false;

            return true;
        }

        public Destination MostVisitedDestination()
        {
          return new Destination("Barcelona");
        }

        public IList<Destination> MostVisitedDestinations(int number)
        {
            IList<Destination> destinations = new List<Destination>();
            destinations.Add(new Destination("Barcelona"));
            destinations.Add(new Destination("Madrid"));
            destinations.Add(new Destination("Chicago"));
            destinations.Add(new Destination("Boston"));
            destinations.Add(new Destination("London"));
            destinations.Add(new Destination("Paris"));
            destinations.Add(new Destination("Roma"));
            destinations.Add(new Destination("Atlantla"));
            destinations.Add(new Destination("New York"));
            destinations.Add(new Destination("Los Angeles"));
            return destinations;
        }


        public int NumberOfTravelsByDestination(string destination)
        {
            return 10;
        }
    }
}
