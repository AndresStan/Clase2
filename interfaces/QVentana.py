from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout, QGroupBox, QRadioButton, QGridLayout, QStackedLayout, QTabWidget, QToolBar, QStatusBar, QDialog, QDialogButtonBox, QMessageBox
from Color import Color
from PyQt6.QtGui import QAction, QIcon
from dialogs import CustomDialog


class OtraVentana(QWidget):
    def __init__(self): # Asi se crea una funcion
            super().__init__()
            plantilla = QVBoxLayout()
            self.etiqueta = QLabel("Otra Ventana")
            plantilla.addWidget(self.etiqueta)
            self.setLayout(plantilla)

class MainWindow(QMainWindow): # Asi se crea una clase
    def __init__(self): # Asi se crea una funcion
        super().__init__()
        self.setWindowTitle("MiTitulo")
    
        boton =  QPushButton("Pulsa aqui")
        boton.clicked.connect(self.mostrarVentana)
        self.setCentralWidget(boton)
        
    
    def mostrarVentana(self):
        self.window = OtraVentana()
        self.window.show()
        
app = QApplication([])
window = MainWindow()

window.show()

app.exec() # Poner siempre si no la ventana se cierra instant