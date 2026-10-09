from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout, QGroupBox, QRadioButton, QGridLayout, QStackedLayout, QTabWidget, QToolBar, QStatusBar, QDialog, QDialogButtonBox
from Color import Color
from PyQt6.QtGui import QAction, QIcon


class CustomDialog(QDialog): # Asi se crea una clase
    def __init__(self): # Asi se crea una funcion
        super().__init__()
        
        self.setWindowTitle("Cuadro de dialogo")
        
        QBtn = QDialogButtonBox.StandardButton.Ok | QDialogButtonBox.StandardButton.Cancel
        
        self.dialogBox = QDialogButtonBox(QBtn)
        self.dialogBox.accepted.connect(self.accept)
        self.dialogBox.rejected.connect(self.reject)
   
        self.plantilla = QVBoxLayout()
        mensaje = QLabel("Algo ha sucedido ¿todo Ok?")
        mensaje.setAlignment(Qt.AlignmentFlag.AlignHCenter)
        
        self.plantilla.addWidget(mensaje)
        self.plantilla.addWidget(self.dialogBox)
        self.setLayout(self.plantilla)
        
        
        
        