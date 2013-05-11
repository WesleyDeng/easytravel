using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Input;
using System.Windows;
using System.ComponentModel;

namespace Armandorv.EasytravelClient.ViewModel
{
    internal abstract class MenuViewModelSupport: ViewModelSupport
    {
        private ICommand showHomeCommand;
        private ICommand showTravelsBrowserCommand;
        private ICommand showHasVisitedCommand;
        private ICommand showMostVisitedCommand;

        public MenuViewModelSupport()
        {
            this.showHomeCommand = new DelegateCommand(o => ShowHome());
            this.showTravelsBrowserCommand = new DelegateCommand(o => ShowTravelsBrowser());
            this.showHasVisitedCommand = new DelegateCommand(o => ShowHasVisited());
            this.showMostVisitedCommand = new DelegateCommand(o => ShowVisitedCommand());
        }

        public abstract void ShowHome();

        public abstract void ShowTravelsBrowser();

        public abstract void ShowHasVisited();

        public abstract void ShowVisitedCommand();

        public ICommand ShowHomeCommand
        {
            get { return showHomeCommand; }
            set { showHomeCommand = value; }
        }

        public ICommand ShowTravelsBrowserCommand
        {
            get { return showTravelsBrowserCommand; }
            set { showTravelsBrowserCommand = value; }
        }

        public ICommand ShowHasVisitedCommand
        {
            get { return showHasVisitedCommand; }
            set { showHasVisitedCommand = value; }
        }

        public ICommand ShowMostVisitedCommand
        {
            get { return showMostVisitedCommand; }
            set { showMostVisitedCommand = value; }
        }
    }
}
