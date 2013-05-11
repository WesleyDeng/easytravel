using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Armandorv.EasytravelWsClient.TravelsWs;

namespace Armandorv.EasytravelWsClient
{
    public interface ITravelsService
    {
        IList<Travel> GetTravels(String term);

        Destination MostVisitedDestination();

        IList<Destination> MostVisitedDestinations(int number);

        bool HasVisited(String username, String destination);

        int NumberOfTravelsByDestination(String destination);
    }
}
