from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout, QGroupBox, QRadioButton, QGridLayout, QStackedLayout, QTabWidget, QToolBar, QStatusBar, QDialog, QDialogButtonBox
from Color import Color
from PyQt6.QtGui import QAction, QIcon
from dialogs import CustomDialog

class MainWindow(QMainWindow): # Asi se crea una clase
    def __init__(self): # Asi se crea una funcion
        super().__init__()
        self.setWindowTitle("MiTitulo")
       
        boton =  QPushButton("Pulsa aqui")
        boton.clicked.connect(self.botonPulsado)
        self.setCentralWidget(boton)
        
    def botonPulsado(self, s):
        dlg=CustomDialog() # Si queremos que la ventana que salga no tenga nada que ver con nuestro programa
        #  dlg=QDialog(self) Si queremos que la ventana este atacheada a nuestro programa y que no se pueda tocar nada
        dlg.setWindowTitle("Cuadro de dialogo")
        dlg.exec()
        
        
app = QApplication([])

window = MainWindow()

window.show()



app.exec() # Poner siempre si no la ventana se cierra instant