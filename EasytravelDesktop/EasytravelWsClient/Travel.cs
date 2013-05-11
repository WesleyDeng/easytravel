using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Armandorv.EasytravelWsClient
{
    public class Travel
    {
        string name;

        public Travel(string name)
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
        