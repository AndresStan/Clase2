from uiMIO.EjercicioFinal import Ui_MainWindow
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget

class MainWindow(QMainWindow, Ui_MainWindow):
    def __init__(self):
        super(MainWindow, self).__init__()
        self.setupUi(self)
        self.show()

            

    # Si quieres cambiar el tema de la aplicación,
    #self.comboBox.currentIndexChanged.connect(self.cambiar)
    # puedes usar este método para cargar un archivo QSS diferente según el índice seleccionado en el comboBox.
    #def cambiar(self, e):
    #        with open(f"estilos/temasConComboBox{["0","1","2"][e]}.qss", "r") as f: 
    #            app.setStyleSheet(f.read())
      
    
app = QApplication([])
#Tipos de diseño: "Fusion", "Windows", "WindowsVista", "Macintosh", "macOS", "GTK+", "CDE", "Plastique", "Cleanlooks", "Motif", "Oxygen", "Breeze"
app.setStyle("Fusion")
with open("estilos/EjercicioFinal.qss", "r") as f: 
        app.setStyleSheet(f.read())
        
ventana = MainWindow()
app.exec()