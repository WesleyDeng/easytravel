using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Armandorv.EasytravelWsClient;
using System.Configuration;

namespace Armandorv.EasytravelClient.Model
{
    internal class ServicesFactory
    {
        private static ServicesFactory INSTANCE = new ServicesFactory();

        private ITravelsService travelsService = null;

        private ServicesFactory()
        {
            String className = ConfigurationManager.AppSettings["ITravelsService.implementor.class"];
            travelsService = (ITravelsService)Activator.CreateInstance(Type.GetType(className));
        }

        public static ServicesFactory Instance(){
            return INSTANCE;
        }

        public ITravelsService TravelsService()
        {
            return travelsService;
        }
    }
}
