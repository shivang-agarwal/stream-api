-- Select supplier wise product count. Output should be Supplier name and count of different products supplied
select s.sname, t.product_count from supplier s, (select sid, count(*) as product_count from product group by sid) as t where s.sid = t.sid;

-- Group all the suppliers based on City name and find the count of products
select scity, count(*) from product p, supplier s where p.sid = s.sid group by s.scity;

-- Group supplier with the total amount of product supplied
select s.sname, t.total_product_cost from supplier s, (select sid, sum(pamount) as total_product_cost from product group by sid) as t where s.sid = t.sid;