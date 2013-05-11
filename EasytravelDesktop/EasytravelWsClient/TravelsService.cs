using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Armandorv.EasytravelWsClient.TravelsWs;

namespace Armandorv.EasytravelWsClient
{
    public class TravelsService: ITravelsService
    {
        public IList<Travel> GetTravels(String term)
        {
            using (travelsWebServiceClient client = new travelsWebServiceClient())
            {
              travel[] travels = client.getTravels(term);
              return map(travels, o => TravelFromWs(o));
            }
        }

        public Destination MostVisitedDestination()
        {
            using (travelsWebServiceClient client = new travelsWebServiceClient())
            {
                destiny destination = client.mostVistedDestination();
                return DestinationFromWs(destination);
            }
        }

        public IList<Destination> MostVisitedDestinations(int number)
        {
            using (travelsWebServiceClient client = new travelsWebServiceClient())
            {
                destiny [] destinations = client.mostVistedDestinations(number);
                return map(destinations, o => DestinationFromWs(o));
            }
        }

        public bool HasVisited(String username, String destination)
        {
            using (travelsWebServiceClient client = new travelsWebServiceClient())
            {
                return client.isVisited(username, destination);
            }
        }

        public int NumberOfTravelsByDestination(String destination)
        {
            using (travelsWebServiceClient client = new travelsWebServiceClient())
            {
                return client.numberTravelsByDestination(destination);
            }
        }

        #region Private Methods

        private IList<R> map<S,R>(S [] source,Func<S, R> mapping)
        {
            IList<R> result = new List<R>();

            if (source == null)
                return result;
            
            foreach (S element in source)
            {
                result.Add(mapping.Invoke(element));
            }
            return result;
        }

        private Travel TravelFromWs(travel travel)
        {
            if (travel == null)
                return null;

            return new Travel(travel.name);
        }

        private Destination DestinationFromWs(destiny destination)
        {
            if (destination == null)
                return null;

            return new Destination(destination.name);
        }

        #endregion

    }
}
