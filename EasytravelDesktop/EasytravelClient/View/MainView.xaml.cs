using System.Windows;
using System.Windows.Input;
using Armandorv.EasytravelClient.ViewModel;

namespace Armandorv.EasytravelClient.View
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainView : Window
    {
        private MainViewModel viewModel;

        public MainView()
        {
            InitializeComponent();
        }

        /*Here are events only related with views, no model view*/

        private void EnableDataEdition(object sender, RoutedEventArgs e)
        {
            this.ToChangeTextBoxesState(true, false);
        }

        private void UnableDataEdition(object sender, RoutedEventArgs e)
        {
            this.ToChangeTextBoxesState(false, true);
        }

        private void ToChangeTextBoxesState(bool enabled, bool readOnly)
        {

        }

        private void ModifyPersonalInformation(object sender, RoutedEventArgs e)
        {
            this.UnableDataEdition(sender, e);
        }

        private void ShowCategory(object sender, RoutedEventArgs e)
        {
            if (viewModel == null)
                this.viewModel = (MainViewModel)this.DataContext;
           
        }

        private void DoubleClickOnCell(object sender, MouseButtonEventArgs e)
        {
            this.ShowCategory(sender, e);
        }

        private void ListBoxItem_Selected(object sender, RoutedEventArgs e)
        {

        }
    }
}
