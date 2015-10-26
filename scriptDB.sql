CREATE TABLE IF NOT EXISTS `user` (
	`idUser` int(11) primary key NOT NULL auto_increment,
  `username` varchar(20) NOT NULL,
  `password` varchar(45) not null
)


CREATE TABLE IF NOT EXISTS `spreadsheet` (
`idSpreadSheet` int(11) primary key NOT NULL auto_increment,
 `name` varchar(45) default 'SpreadSheetNoName',
 ownerId int not null,
 foreign key (ownerId) references user(idUser)
)


CREATE TABLE IF NOT EXISTS `permission` (
`idPermission` int(11) primary key NOT NULL auto_increment ,
  `idSpreadSheet` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  foreign key (idSpreadSheet) references spreadsheet(idSpreadSheet),
  foreign key (idUser) references user(idUser)
)




