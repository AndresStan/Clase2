from uiMIO.temasConComboBox import Ui_MainWindow
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget

class MainWindow(QMainWindow, Ui_MainWindow):
    def __init__(self):
        super(MainWindow, self).__init__()
        self.setupUi(self)
        self.show()
        self.comboBox.currentIndexChanged.connect(self.cambiar)
    
    def cambiar(self, e):
            with open(f"estilos/temasConComboBox{["0","1","2"][e]}.qss", "r") as f: 
                app.setStyleSheet(f.read())
      
        
app = QApplication([])
app.setStyle("Fusion")
with open("estilos/temasConComboBox0.qss", "r") as f: 
        app.setStyleSheet(f.read())
ventana = MainWindow()
app.exec()