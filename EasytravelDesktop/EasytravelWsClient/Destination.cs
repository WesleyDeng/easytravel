using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Armandorv.EasytravelWsClient
{
    public class Destination
    {
         string name;

        public Destination(string name)
        {
            this.name = name;
        }

        public string Name
        {
            get{
            return name;
            }
        }
    }
}
