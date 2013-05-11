using System.Windows;
using System.ComponentModel;
using System.Windows.Input;
using System;
using System.Windows.Controls;
using Armandorv.EasytravelClient.View;
using Armandorv.EasytravelWsClient;
using Armandorv.EasytravelClient.Model;
using System.Collections.Generic;
using System.Windows.Media;
using System.Windows.Media.Imaging;

namespace Armandorv.EasytravelClient.ViewModel
{
    class MainViewModel : MenuViewModelSupport
    {
        private MainView mainView;

        private BindingList<Travel> travels;
        private BindingList<Destination> mostVisitedDestinations;
       
        private ICommand searchTravelsCommand;
        private ICommand checkHasVisitedCommand;
        private ICommand refreshMostVisitedCommand;

        private string term;

        private string username;

        private string destination;

        public MainViewModel(MainView mainView)
        {
            this.mainView = mainView;
            this.travels = new BindingList<Travel>();
            this.mostVisitedDestinations = new BindingList<Destination>();

            this.searchTravelsCommand = new DelegateCommand(o => SearchTravels(term));
            this.checkHasVisitedCommand = new DelegateCommand(o => CheckHasVisited(username, destination));
            this.refreshMostVisitedCommand = new DelegateCommand(o => RefreshMostVisited());
        }

        private void SearchTravels(String term)
        {
            ServicesFactory factory = ServicesFactory.Instance();
            IList<Travel> tvls = factory.TravelsService().GetTravels(term);
            this.travels.Clear();
            foreach (Travel tvl in tvls)
            {
                this.travels.Add(tvl);
            }

            this.mainView.termTextBox.Clear();
        }
        
        private void CheckHasVisited(String username , String destination)
        {
            ServicesFactory factory =  ServicesFactory.Instance();
            bool hasVisited = factory.TravelsService().HasVisited(username, destination);
            this.mainView.yesNoImage.Source = ImageSource(hasVisited);
        }

        private ImageSource ImageSource(bool yes)
        {
            string name = yes ? "/yes.jpg" : "/no.jpg";
            string strUri2 = String.Format(@"pack://application:,,,/EasytravelClient;component/Images" + name);
            return new BitmapImage(new Uri(strUri2));
        }

        private void RefreshMostVisited()
        {
            ServicesFactory factory = ServicesFactory.Instance();
            Destination destination = factory.TravelsService().MostVisitedDestination();
            int num = factory.TravelsService().NumberOfTravelsByDestination(destination.Name);

            this.mainView.mostVisitedDesstinationTextBlock.Text = destination.Name;
            this.mainView.mostVisitedDesstinationNumbersTextBlock.Text = num + "";

            IList<Destination> dsts = factory.TravelsService().MostVisitedDestinations(10);
            this.mostVisitedDestinations.Clear();
            foreach (Destination dst in dsts)
            {
                this.mostVisitedDestinations.Add(dst);
            }
        }


        /* Menu methods */

        public override void ShowHome()
        {
            this.mainView.selectedOptionTabControl.SelectedIndex = 0;
        }

        public override void ShowTravelsBrowser()
        {
            this.mainView.selectedOptionTabControl.SelectedIndex = 1;
        }

        public override void ShowHasVisited()
        {
            this.mainView.selectedOptionTabControl.SelectedIndex = 2;
        }

        public override void ShowVisitedCommand()
        {
            RefreshMostVisited();
            this.mainView.selectedOptionTabControl.SelectedIndex = 3;
        }

        public string Term
        {
            set { this.term = value; }
            get { return term; }
        }

        public string Username
        {
            set { this.username = value; }
            get { return this.username; }
        }

        public string Destination
        {
            set { this.destination = value; }
            get { return this.destination; }
        }

        public BindingList<Travel> Travels
        {
            set { this.travels = value; }
            get { return travels; }
        }

        public BindingList<Destination> MostVisitedDestinations
        {
            set { this.mostVisitedDestinations = value; }
            get { return mostVisitedDestinations; }
        }

        public ICommand SearchTravelsCommand
        {
            set { this.searchTravelsCommand = value; }
            get { return searchTravelsCommand; }
        }

        public ICommand CheckHasVisitedCommand
        {
            set { this.checkHasVisitedCommand = value; }
            get { return checkHasVisitedCommand; }
        }

        public ICommand RefreshMostVisitedCommand
        {
            set { this.refreshMostVisitedCommand = value; }
            get { return refreshMostVisitedCommand; }
        }
    }
}