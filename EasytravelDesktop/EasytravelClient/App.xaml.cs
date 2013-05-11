using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Windows;
using Armandorv.EasytravelClient.ViewModel;
using Armandorv.EasytravelClient.View;

namespace Armandorv.EasytravelClient
{
    /// <summary>
    /// Lógica de interacción para App.xaml
    /// </summary>
    public partial class App : Application
    {
        private void Application_Startup(object sender, StartupEventArgs e)
        {
            MainView view = new MainView();
            view.DataContext = new MainViewModel(view);
            view.Show();
        }
    }
}
