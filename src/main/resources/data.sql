insert into NACE_ENTITY (order_id, level_id, code, parent, description, inc, also, rulings, excl, ref) values (1, 1, 'A', 'A', 'item 1', 'nothing to include', 'no', 'rule 1.23', 'nothing to exclude', '1');
insert into NACE_ENTITY (order_id, level_id, code, parent, description, inc, also, rulings, excl, ref) values (2, 1, 'B', 'A', 'item 2', 'item 1', 'item 0', 'rule 1.4', 'nothing to exclude', '1.1');
insert into NACE_ENTITY (order_id, level_id, code, parent, description, inc, also, rulings, excl, ref) values (3, 2, 'C', 'B', 'item 3', 'item 3', 'item 0', 'rule 1.5', 'nothing to exclude', '1.2');
insert into NACE_ENTITY (order_id, level_id, code, parent, description, inc, also, rulings, excl, ref) values (4, 2, 'D', 'C', 'item 4', 'item 4', 'item 0', 'rule 1.6', 'nothing to exclude', '1.3');
insert into NACE_ENTITY (order_id, level_id, code, parent, description, inc, also, rulings, excl, ref) values (5, 3, 'E', 'D', 'item 5', 'item 3', 'item 0', 'rule 1.7', 'nothing to exclude', '1.4');
insert into NACE_ENTITY (order_id, level_id, code, parent, description, inc, also, rulings, excl, ref) values (6, 3, 'F', 'E', 'item 6', 'item 3', 'item 0', 'rule 1.8', 'nothing to exclude', '1.5');